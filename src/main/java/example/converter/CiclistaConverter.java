package example.converter;

import org.springframework.stereotype.Component;

import example.entity.Ciclista;
import example.model.CiclistaModel;

@Component("ciclistaConverter")
public class CiclistaConverter {
	
	//Entity --> Model
		public CiclistaModel entity2model(Ciclista ciclista) {
		CiclistaModel ciclistaModel=new CiclistaModel();
		ciclistaModel.setNombre(ciclista.getNombre());
		ciclistaModel.setDorsal(ciclista.getDorsal());
		ciclistaModel.setEdad(ciclista.getEdad());
		ciclistaModel.setFoto(ciclista.getFoto());
		ciclistaModel.setNomeq(ciclista.getNomeq());
		return ciclistaModel;
		}
		
		//Model 2 Entity
		public Ciclista model2entity(CiclistaModel ciclistaModel) {
			Ciclista ciclista=new Ciclista();
			ciclista.setNombre(ciclistaModel.getNombre());
			ciclista.setDorsal(ciclistaModel.getDorsal());
			ciclista.setEdad(ciclistaModel.getEdad());
			ciclista.setFoto(ciclistaModel.getFoto());
			ciclista.setNomeq(ciclistaModel.getNomeq());
			return ciclista;
		}

}
