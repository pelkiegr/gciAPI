package billing.servlet;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import billing.dao.OrderDao;
import billing.elements.Invoice;

@WebServlet("/Invoices")
public class InvoiceServlet extends HttpServlet {

    private static final long serialVersionUID = -1051090919909529627L;
    private OrderDao orderDao;
    private Gson gson;

    public void init() throws ServletException {
        orderDao = new OrderDao();
        gson = new GsonBuilder().registerTypeAdapter(DateTime.class, new JsonSerializer<DateTime>() {
            @Override
            public JsonElement serialize(DateTime json, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive(ISODateTimeFormat.dateTime().print(json));
            }
        }).create();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        String invoiceId = request.getParameter("id");
        String json = "";
        if (invoiceId != null) {
            Invoice i = orderDao.getInvoiceById(invoiceId);
            if (i == null) {
                resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                return;
            }
            json = gson.toJson(i);
        } else {
            Collection<Invoice> i = orderDao.getAllInvoices();
            json = gson.toJson(i);
        }
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
