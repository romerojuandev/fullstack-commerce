package com.comercio.controller;

import com.comercio.controller.dto.ClientDTO;
import com.comercio.entities.Client;
import com.comercio.service.interfaces.IClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService clientService;
    private final ModelMapper modelMapper = new ModelMapper();

    @GetMapping("/find/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id){

        Optional<Client> optionalClient = this.clientService.findById(id);

        if(optionalClient.isPresent()){

            Client client = optionalClient.get();
            ClientDTO clientDTO = this.modelMapper.map(client, ClientDTO.class);

            return ResponseEntity.ok(clientDTO);
        }

        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/find")
    public ResponseEntity<List<ClientDTO>> findAll(){

        List<ClientDTO> clientDTOList = this.clientService.findAll()
                .stream()
                .map(client -> this.modelMapper.map(client, ClientDTO.class))
                .collect(Collectors.toList());

        return ResponseEntity.ok(clientDTOList);
    }

    @PostMapping("/save")
    public ResponseEntity<ClientDTO> save(@RequestBody ClientDTO clientDTO) throws URISyntaxException{

        Client client = this.modelMapper.map(clientDTO, Client.class);

        this.clientService.save(client);

        return ResponseEntity.created(new URI("/client/save")).build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ClientDTO> update(@RequestBody ClientDTO clientDTO, @PathVariable Long id){

        Optional<Client> optionalClient = this.clientService.findById(id);

        if(optionalClient.isPresent()){

            Client client = optionalClient.get();
            client.setName(clientDTO.getName());
            client.setSurname(clientDTO.getSurname());
            client.setEmail(clientDTO.getEmail());
            client.setAddress(clientDTO.getAddress());
            client.setCellphoneNumber(clientDTO.getCellphoneNumber());

            this.clientService.save(client);

            return  ResponseEntity.ok(clientDTO);
        }

        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){

        Optional<Client> optionalClient = this.clientService.findById(id);

        if(optionalClient.isPresent()){

            this.clientService.deleteById(id);

            return ResponseEntity.ok("Deleted");
        }

        return ResponseEntity.badRequest().build();
    }

}
