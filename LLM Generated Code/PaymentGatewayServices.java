package generated;

import generated.DispatchContext;
import generated.OrderListState;
import generated.EntityTypeUtil;

/** LLM-generated reconstruction from the supplied description. */
public class PaymentGatewayServices {
    private final DispatchContext context;
    private final OrderListState orders;
    private final EntityTypeUtil entityTypes;
    public PaymentGatewayServices(DispatchContext context, OrderListState orders, EntityTypeUtil entityTypes) { this.context=context; this.orders=orders; this.entityTypes=entityTypes; }
public boolean authorize(double amount) { return amount >= 0 && context != null && orders != null && entityTypes != null; }
}
