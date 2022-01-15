package visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    //å ����
    @Override
    public int visit(Book book) {
        int cost=0;
        // book ���� 50�޷� �̻��̸� 5�޷� ����
        if(book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else{
            cost = book.getPrice();
        }
        System.out.println("å ��ȣ :: " + book.getIsbnNumber() + " ���� = " + cost);

        return cost;
    }

    //���� ����
    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(fruit.getName() + " ���� = "+cost);
        return cost;
    }
}

