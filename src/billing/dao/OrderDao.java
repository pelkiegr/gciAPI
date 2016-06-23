package billing.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.joda.time.DateTime;

import billing.elements.Cost;
import billing.elements.Invoice;
import billing.elements.Order;
import billing.elements.object.Contract;
import billing.elements.object.ContractItem;
import billing.elements.object.ServiceOrder;
import billing.elements.object.ServicesAgreement;

public class OrderDao {

    private Collection<Order> orders = new ArrayList<Order>();
    private Collection<Invoice> invoices = new ArrayList<Invoice>();
    {
        Contract c = new Contract("HB-134", new DateTime(2014, 2, 1, 0, 0, 0), new DateTime(2016, 2, 29, 0, 0, 0));
        List<ContractItem> l1 = new ArrayList<ContractItem>();
        l1.add(new ContractItem("Site 1", "100 Mbps MPLS", 7442));
        l1.add(new ContractItem("Site 2", "100 Mbps MPLS", 245));
        l1.add(new ContractItem("Site 3", "100 Mbps MPLS", 3325));
        l1.add(new ContractItem("Site 4", "100 Mbps MPLS", 3618));
        l1.add(new ContractItem("Site 5", "100 Mbps MPLS", 4093));
        c.setContractItems(l1);

        ServiceOrder so = new ServiceOrder("WT-239", new DateTime(2015, 11, 24, 0, 0, 0),
                new DateTime(2018, 11, 24, 0, 0, 0));
        List<Cost> oneCost = new ArrayList<Cost>();
        oneCost.add(new Cost(3485, "Configuration and Testing of Equipment"));
        so.setOneTimeCosts(oneCost);
        List<Cost> recCost = new ArrayList<Cost>();
        recCost.add(new Cost(275, "Remote Site VPN"));
        so.setRecurringCosts(recCost);

        ServicesAgreement sa = new ServicesAgreement("SA-432", new DateTime(2015, 6, 18, 0, 0, 0),
                new DateTime(2016, 6, 18, 0, 0, 0));
        sa.setMaxHours(160);
        sa.setRate(125);
        sa.setSummary(
                "This SOW covers the discover and documentation of ABC Health Coporation's (ABCHC) wired and wireless local area networks (LANs).");
        sa.setScope("Document and evaluation IP Address allocation and usage");

        List<Invoice> lso = new ArrayList<Invoice>();
        Invoice i1 = new Invoice("335783", 275, new DateTime(2016, 1, 28, 23, 59, 59));
        i1.setOrderId(so.getId());
        lso.add(i1);
        Invoice i3 = new Invoice("301389", 275, new DateTime(2015, 11, 25, 0, 0, 0));
        i3.setPaidDate(new DateTime(2015, 11, 26, 0, 0, 0));
        i3.setOrderId(so.getId());
        lso.add(i3);

        List<Invoice> lc = new ArrayList<Invoice>();
        Invoice i2 = new Invoice("312236", 51155, new DateTime(2015, 12, 30, 23, 59, 59));
        i2.setOrderId(c.getId());
        lc.add(i2);
        Invoice i4 = new Invoice("288193", 51155, new DateTime(2015, 11, 24, 0, 0, 0));
        i4.setPaidDate(new DateTime(2015, 11, 25, 0, 0, 0));
        i4.setOrderId(c.getId());
        lc.add(i4);
        Invoice i6 = new Invoice("268381", 51155, new DateTime(2015, 7, 27, 0, 0, 0));
        i6.setPaidDate(new DateTime(2015, 7, 28, 0, 0, 0));
        i6.setOrderId(c.getId());
        lc.add(i6);
        Invoice i7 = new Invoice("257181", 51155, new DateTime(2015, 6, 23, 0, 0, 0));
        i7.setPaidDate(new DateTime(2015, 6, 24, 0, 0, 0));
        i7.setOrderId(c.getId());
        lc.add(i7);
        Invoice i8 = new Invoice("248184", 51155, new DateTime(2015, 5, 20, 0, 0, 0));
        i8.setPaidDate(new DateTime(2015, 5, 21, 0, 0, 0));
        i8.setOrderId(c.getId());
        lc.add(i8);

        List<Invoice> lsa = new ArrayList<Invoice>();
        Invoice i5 = new Invoice("279192", 49390, new DateTime(2015, 8, 26, 0, 0, 0));
        i5.setPaidDate(new DateTime(2015, 8, 27, 0, 0, 0));
        i5.setOrderId(sa.getId());
        lsa.add(i5);

        c.setInvoiceList(lc);
        so.setInvoiceList(lso);
        sa.setInvoiceList(lsa);

        orders.add(c);
        orders.add(so);
        orders.add(sa);

        invoices.addAll(lc);
        invoices.addAll(lso);
        invoices.addAll(lsa);

    }

    public Collection<Order> getAllOrders() {
        return orders;
    }

    public Order getOrderById(String id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public Collection<Invoice> getAllInvoices() {
        return invoices;
    }

    public Invoice getInvoiceById(String id) {
        for (Invoice invoice : invoices) {
            if (invoice.getId().equals(id)) {
                return invoice;
            }
        }
        return null;
    }
}
