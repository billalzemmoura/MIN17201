package td1.SRP;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
	public void afficheTest( )
    {
        Employe employe1=new Employe(2400.0); 
        employe1.AfficheCordonnes();
        employe1.AfficheSalaire();
       assertTrue(employe1.calculSalaire()==(2400.0*12));
    }

}
