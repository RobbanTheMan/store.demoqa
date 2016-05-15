import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestHomeflik.class, TestProduktsidor.class, TestProductCategory.class, TestSearchProducts.class,
	TestAddToCart.class, })
public class JunitTestSuit {

}
