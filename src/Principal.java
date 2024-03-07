public class Principal {


    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("Augusto", "18495");

        Pagamento p1 = new Pagamento("Compra 1", 765.14);
        Pagamento p2 = new Pagamento("Compra 2", 695.98);
        Pagamento p3 = new Pagamento("Compra 3", 1786.31);
        Pagamento p4 = new Pagamento("Compra 4", 582.50);

        f1.getPagamentos().add(p1);
        f1.getPagamentos().add(p2);
        f1.getPagamentos().add(p3);
        f1.getPagamentos().add(p4);

        System.out.println("O fornecedor " + f1.getNome() + " recebeu os pagamentos " + f1.totalPagamento());
    }
}
