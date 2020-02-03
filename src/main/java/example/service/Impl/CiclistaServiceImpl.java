package example.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import example.model.ciclista;
import example.service.CiclistaService;

@Service("ciclistaService")
public class CiclistaServiceImpl implements CiclistaService {

	@Override
	public List<ciclista> getListciclista() {
		List<ciclista> ciclistas=new ArrayList<>();
		return ciclistas;
	}

}
