package ar.com.ada.api.creditos.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ar.com.ada.api.creditos.entities.*;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer>{

    @Query("FROM Prestamo WHERE cliente.nombre like CONCAT('%', :nombre,'%')")
    List<Prestamo> findByNombreCliente(@Param("nombre") String nombre);

}
