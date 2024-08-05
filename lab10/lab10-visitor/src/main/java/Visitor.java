public interface Visitor {
    void visit(CorporateOrder order);
    void visit(IndividualOrder order);
    void visit(InternalOrder order);
}
