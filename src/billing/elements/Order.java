package billing.elements;

import java.util.List;

import org.joda.time.DateTime;

public abstract class Order {

    protected String id;
    protected DateTime startDate;
    protected DateTime endDate;
    private List<Invoice> invoiceList;

    public Order(String id, DateTime startDate, DateTime endDate) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the startDate
     */
    public DateTime getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public DateTime getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the invoiceList
     */
    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    /**
     * @param invoiceList the invoiceList to set
     */
    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

}
