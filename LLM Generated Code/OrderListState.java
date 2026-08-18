package generated;

import generated.OrderByItem;
import generated.EntityTypeUtil;

/** LLM-generated reconstruction from the supplied description. */
public class OrderListState {
    private final OrderByItem orderBy;
    private final EntityTypeUtil entityTypes;
    private int page=1;
    public OrderListState(OrderByItem orderBy, EntityTypeUtil entityTypes) { this.orderBy=orderBy; this.entityTypes=entityTypes; }
public int nextPage() { return ++page; }
}
