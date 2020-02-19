package example.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import example.converter.CiclistaConverter;
import example.entity.Ciclista;
import example.model.CiclistaModel;
import example.repository.CiclistaJpaRepository;
import example.service.CiclistaService;

@Service
public class CiclistaServiceImpl implements CiclistaService {
	
	@Autowired
	@Qualifier("ciclistaJpaRepository")
	private CiclistaJpaRepository ciclistaJpaRepository;
	
	@Autowired
	@Qualifier("ciclistaConverter")
	private CiclistaConverter ciclistaConverter;

	@Override
	public List<CiclistaModel> getListciclista() {
		//return courseJpaRepository.findAll();
		List<CiclistaModel> ciclistaModel=new ArrayList<CiclistaModel>();
		for(Ciclista ciclistaEntity: ciclistaJpaRepository.findAll())
			ciclistaModel.add(ciclistaConverter.entity2model(ciclistaEntity));
		return ciclistaModel;
	}

	@Override
	public Ciclista addCiclista(CiclistaModel ciclistaModel) {
		Ciclista ciclista=ciclistaConverter.model2entity(ciclistaModel);
		return ciclistaJpaRepository.save(ciclista);
	}

	@Override
	public int removeCiclista(int id) {
		ciclistaJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Ciclista updateCiclista(CiclistaModel ciclistaModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
