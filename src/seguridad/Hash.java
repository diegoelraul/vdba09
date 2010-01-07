package seguridad;

import java.io.UnsupportedEncodingException;
import controlador.VideoclubException;

public class Hash {
	
	public static String getMD5Hash(String entrada) throws VideoclubException {
		
		MD5 md5 = new MD5();
        try {
			md5.Update(entrada, null);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			throw new VideoclubException(e.getLocalizedMessage());
		}
        
        return md5.asHex();

	}
	
	/*public static void main (String arg[]) throws UnsupportedEncodingException, VideoclubException{
	
	System.out.println(Hash.getMD5Hash("pepe"));
    System.out.println(Hash.getMD5Hash("pepe").equals(Hash.getMD5Hash("pepe")));
	}*/
}
