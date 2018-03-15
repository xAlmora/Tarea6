package mx.itam;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
