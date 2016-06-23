package billing.elements.object;

import org.joda.time.DateTime;

import billing.elements.Order;

public class ServicesAgreement extends Order {

    private long maxHours;
    private float rate;
    private String summary;
    private String scope;

    public ServicesAgreement(String id, DateTime startDate, DateTime endDate) {
        super(id, startDate, endDate);
    }

    public ServicesAgreement(String id, DateTime startDate, DateTime endDate, long maxHours, float rate, String summary,
            String scope) {
        super(id, startDate, endDate);
        this.setMaxHours(maxHours);
        this.setRate(rate);
        this.setSummary(summary);
        this.setScope(scope);
    }

    /**
     * @return the maxHours
     */
    public long getMaxHours() {
        return maxHours;
    }

    /**
     * @param maxHours the maxHours to set
     */
    public void setMaxHours(long maxHours) {
        this.maxHours = maxHours;
    }

    /**
     * @return the rate
     */
    public float getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(float rate) {
        this.rate = rate;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * @param scope the scope to set
     */
    public void setScope(String scope) {
        this.scope = scope;
    }
}
