package utilitats;
 
import java.util.ArrayList;
import java.util.Collection;
 
public class CostPersonal {
 
static float CostDelPersonal(Treballador treballadors[]) {
float costFinal = 0;
Treballador empleat;
for (int i = 0; i < treballadors.length; i++) {
empleat = treballadors[i];
if ( empleat.getTipusTreballador() == Treballador.DIRECTOR|| empleat.getTipusTreballador() == Treballador.SUBDIRECTOR) {
costFinal += empleat.getNomina();
}
else
{
costFinal += empleat.getNomina() + (empleat.getHoresExtres() * 20);
}
}
return costFinal;
}        
}