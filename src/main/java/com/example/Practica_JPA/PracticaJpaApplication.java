package com.example.Practica_JPA;

import com.example.Practica_JPA.Model.Categoria;
import com.example.Practica_JPA.Repository.CategoriasRepository;
import com.example.Practica_JPA.Repository.VacatantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;

@SpringBootApplication
public class PracticaJpaApplication /*implements CommandLineRunner*/ {

	@Autowired
	private CategoriasRepository repositorioCategorias;
	@Autowired
	private VacatantesRepository repositorioVacantes;

	public static void main(String[] args) {
		SpringApplication.run(PracticaJpaApplication.class, args);
	}


	/*public void run(String... args) throws Exception {
	    //guardar();
		//modificarById();
		//buscarxId();
		//eliminarById();
		//buscarxId();

		//eee();
	}*/


	private void eee() {
		Optional<Categoria> cat =repositorioCategorias.findById(19);
		if (cat.isPresent()){
			repositorioCategorias.delete(cat.get());
		}
	}
	private void eliminarById(){
		int eliminarCat=2;
		repositorioCategorias.deleteById(eliminarCat);
	}
	private void modificarById(){
		Optional<Categoria> optional =repositorioCategorias.findById(20);
		if (optional.isPresent()) {
			Categoria catTem= optional.get();
			catTem.setNombre("Profesor de Algoritmos Java");
			catTem.setDescripcion("Para clases particulares");
			repositorioCategorias.save(catTem);
			System.out.println(optional.get());
		}
		else System.out.println("Categoria no encontrada");

	}
	private void buscarXNombre(){
		Optional<Categoria> find=repositorioCategorias.findByNombre("Finanzas");
		System.out.println(find);
	}
	private void buscarxId(){
		Optional<Categoria> optional =repositorioCategorias.findById(20);

		if (optional.isPresent()) {
			System.out.println(optional.get());

		}
		else System.out.println("Categoria no encontrada");



	}
	private void guardar(){
		Categoria cat = new Categoria();
		cat.setNombre("Profesor de matematicas");
		cat.setDescripcion("Para clases particulares");
		Categoria by = repositorioCategorias.save(cat);
		System.out.println(by);

	}
}
