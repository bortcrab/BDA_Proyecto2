package entidades;

import entidades.PlacasEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-09T22:23:48", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(TarifaPlacasEntidad.class)
public class TarifaPlacasEntidad_ { 

    public static volatile SingularAttribute<TarifaPlacasEntidad, String> tipo;
    public static volatile SingularAttribute<TarifaPlacasEntidad, Float> costo;
    public static volatile SingularAttribute<TarifaPlacasEntidad, Long> id;
    public static volatile ListAttribute<TarifaPlacasEntidad, PlacasEntidad> placas;

}