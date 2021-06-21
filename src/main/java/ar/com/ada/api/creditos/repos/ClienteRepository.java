package ar.com.ada.api.creditos.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;
import ar.com.ada.api.creditos.entities.*;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByNombre(String nombreCliente);

    Cliente findByDni(Integer dni);

    List<Cliente> findAllByNombreContiene(String nombre);

    List<Cliente> findAllByNombreAndDNI(String nombre, Integer dni);

    @Query("select h from Cliente h order by nombre")
    List<Cliente> findAllOrderByNombre();

    @Query("SELECT h FROM Cliente h WHERE h.dni = :dni")
    List<Cliente> findByDNIVersion2(@Param("dni") Integer descripcion);
}