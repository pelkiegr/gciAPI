package billing.elements;

import org.joda.time.DateTime;

public class Invoice {

    private String id;
    private float amount;
    private DateTime dueDate;
    private DateTime paidDate;
    private String orderId;

    public Invoice(String id, float amount, DateTime dueDate) {
        this.setId(id);
        this.setAmount(amount);
        this.setDueDate(dueDate);
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
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the dueDate
     */
    public DateTime getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(DateTime dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the order
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param order the order to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the paidDate
     */
    public DateTime getPaidDate() {
        return paidDate;
    }

    /**
     * @param paidDate the paidDate to set
     */
    public void setPaidDate(DateTime paidDate) {
        this.paidDate = paidDate;
    }

}
