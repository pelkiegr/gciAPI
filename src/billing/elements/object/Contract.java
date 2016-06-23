package billing.elements.object;

import java.util.List;

import org.joda.time.DateTime;

import billing.elements.Order;

public class Contract extends Order {

    private List<ContractItem> contractItems;

    public Contract(String id, DateTime startDate, DateTime endDate) {
        super(id, startDate, endDate);
    }

    /**
     * @return the contractItems
     */
    public List<ContractItem> getContractItems() {
        return contractItems;
    }

    /**
     * @param contractItems the contractItems to set
     */
    public void setContractItems(List<ContractItem> contractItems) {
        this.contractItems = contractItems;
    }
}