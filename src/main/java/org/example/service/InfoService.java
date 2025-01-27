package org.example.service;

import org.example.model.InfoFornecedor;
import org.example.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;
    public InfoFornecedor getInfoPorEstado(String estado) {

        return infoRepository.findByEstado(estado);

    }
}
