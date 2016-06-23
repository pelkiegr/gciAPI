package billing.elements.object;

import java.util.List;

import org.joda.time.DateTime;

import billing.elements.Cost;
import billing.elements.Order;

public class ServiceOrder extends Order {

    private List<Cost> oneTimeCosts;
    private List<Cost> recurringCosts;

    public ServiceOrder(String id, DateTime startDate, DateTime endDate) {
        super(id, startDate, endDate);
    }

    public ServiceOrder(String id, DateTime startDate, DateTime endDate, List<Cost> oneTimeCosts,
            List<Cost> recurringCosts) {
        super(id, startDate, endDate);
        this.oneTimeCosts = oneTimeCosts;
        this.recurringCosts = recurringCosts;
    }

    /**
     * @return the oneTimeCost
     */
    public List<Cost> getOneTimeCosts() {
        return oneTimeCosts;
    }

    /**
     * @param oneTimeCost the oneTimeCost to set
     */
    public void setOneTimeCosts(List<Cost> oneTimeCosts) {
        this.oneTimeCosts = oneTimeCosts;
    }

    /**
     * @return the recurringCost
     */
    public List<Cost> getRecurringCosts() {
        return recurringCosts;
    }

    /**
     * @param recurringCost the recurringCost to set
     */
    public void setRecurringCosts(List<Cost> recurringCosts) {
        this.recurringCosts = recurringCosts;
    }

}
