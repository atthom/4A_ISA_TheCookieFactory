package arquillian;

import fr.unice.polytech.isa.tcf.CartModifier;
import fr.unice.polytech.isa.tcf.components.CartBean;
import fr.unice.polytech.isa.tcf.components.carts.CartStatefulBean;
import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.exceptions.AlreadyExistingCustomerException;
import fr.unice.polytech.isa.tcf.interceptors.LogParameters;
import fr.unice.polytech.isa.tcf.utils.Database;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import javax.ejb.EJB;

public abstract class AbstractTCFTest {


	@EJB
	protected Database memory;

	@Deployment
	public static WebArchive createDeployment() {
		// Building a Web ARchive (WAR) containing the following elements:
		return ShrinkWrap.create(WebArchive.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				// Utils
				.addPackage(Database.class.getPackage())
				// Components implementations
				.addPackage(CartBean.class.getPackage())
				// Cart components
				.addPackage(CartStatefulBean.class.getPackage())
				// Persistence file
				.addAsManifestResource(new ClassLoaderAsset("META-INF/persistence.xml"), "persistence.xml");
	}

}
