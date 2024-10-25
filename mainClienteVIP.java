public class mainClienteVIP {
    public static void main(String[] args) {
        ClienteVip ClienteVIP = new ClienteVip();
        ClienteVip ClienteVIP2 = new ClienteVip("dABID",675858);
        ClienteVip ClienteV = new ClienteVip("Mickey",56474,"Mickey@email.com", ClienteVip.tipoVip.NORMAL);

        System.out.println(ClienteV);
        System.out.println(ClienteVIP2);
        System.out.println(ClienteVIP);





    }
}
