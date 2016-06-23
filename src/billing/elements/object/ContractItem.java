package billing.elements.object;

public class ContractItem {

    private String site;
    private String service;
    private float monthlyPrice;

    public ContractItem(String site, String service, float monthlyPrice) {
        this.setSite(site);
        this.setService(service);
        this.setMonthlyPrice(monthlyPrice);
    }

    /**
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * @param site the site to set
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * @return the monthlyPrice
     */
    public float getMonthlyPrice() {
        return monthlyPrice;
    }

    /**
     * @param monthlyPrice the monthlyPrice to set
     */
    public void setMonthlyPrice(float monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }
}
