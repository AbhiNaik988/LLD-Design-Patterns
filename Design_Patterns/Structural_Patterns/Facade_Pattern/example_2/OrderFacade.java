package Design_Patterns.Structural_Patterns.Facade_Pattern.example_2;

public class OrderFacade {
    private InvoiceDaoImpl invoiceDao;
    private PaymentDaoImpl paymentDao;
    private ReceiteDaoImpl receiteDao;
    public OrderFacade(){
        this.invoiceDao = new InvoiceDaoImpl();
        this.paymentDao = new PaymentDaoImpl();
        this.receiteDao = new ReceiteDaoImpl();
    }

    public void placeOrder(){
        this.paymentDao.getPaymentDetails();
        this.receiteDao.getReceite();
        this.invoiceDao.getInvoice();
    }
    //Here, Client just want to know how to place order....Client does not need to know the complexity of paymentDetails,RecieteDeatails,invoice etc..
    //So we create OrderFacade that we will help in abstraction.
}
