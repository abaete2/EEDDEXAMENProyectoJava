/**
 * 
 */
package eedd_ra5redmetro_TMA;

/**
 *
 * ITrenDAO: Clase que realiza ....
 * @author Thiago Muniz Ampuero - IES Virgen de la Paloma
 * @date 16 feb 2026
 *
 *
 */

public class ITrenDAO {
	
    public Tren buscarTrenPorID(String codigoTren);
    public Tren anyadirTren(Tren Tren);
    public Tren actualizarInformacionTren(Tren Tren);
    public Tren borrarTren(String codigoTren);

}
