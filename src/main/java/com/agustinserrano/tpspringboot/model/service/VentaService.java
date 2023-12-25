
package com.agustinserrano.tpspringboot.model.service;

import com.agustinserrano.tpspringboot.dto.MayorVentaDTO;
import com.agustinserrano.tpspringboot.dto.VentasPorDiaDTO;
import com.agustinserrano.tpspringboot.model.Producto;
import com.agustinserrano.tpspringboot.model.Venta;
import com.agustinserrano.tpspringboot.repository.IVentaRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{
    @Autowired
    private IVentaRepository ventaRepo;

    @Override
    public Venta getVenta(Long id) {
        return ventaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Venta> getVentas() {
        return ventaRepo.findAll();
    }

    @Override
    public void deleteVenta(Long id) {
        ventaRepo.deleteById(id);
    }

    @Override
    public void saveVenta(Venta venta) {
        ventaRepo.save(venta);
    }

    @Override
    public void editVenta(Venta venta) {
        ventaRepo.save(venta);
    }

    @Override
    public List<Producto> getProductosVenta(Long id) {
        Venta venta=ventaRepo.findById(id).orElse(null);
        List<Producto> listaProductos=venta.getListaProductos();
        List<Producto> listaNueva=new ArrayList<>();
        for(Producto produ: listaProductos){
            listaNueva.add(produ);
        }
        return listaNueva;
    }

    @Override
    public VentasPorDiaDTO getVentasDia(LocalDate fecha) {
        int cantVentas;
        List<Venta>listaVentas=ventaRepo.findAll();
        VentasPorDiaDTO ventasDto=new VentasPorDiaDTO(0,0);
        for(Venta venta:listaVentas){
            if(venta.getFechaVenta().equals(fecha)){
                cantVentas=ventasDto.getCantVentas();
                
                ventasDto.setMonto(ventasDto.getMonto()+venta.getTotal());
                ventasDto.setCantVentas(cantVentas+1);
            }   
        }
        return ventasDto;
    }

    @Override
    public MayorVentaDTO getMayorVenta() {
        List<Venta> listaVentas=ventaRepo.findAll();
        if(listaVentas.isEmpty())
            return null;
        else{
            double max=-1;
            Venta mayorVenta=new Venta();
            MayorVentaDTO maxVentaDTO=new MayorVentaDTO();
            for(Venta venta:listaVentas){
                if(venta.getTotal()>max){
                    max=venta.getTotal();
                    mayorVenta=venta;
                }
            }
            maxVentaDTO.setCodigoVenta(mayorVenta.getCodigoVenta());
            maxVentaDTO.setTotal(mayorVenta.getTotal());
            maxVentaDTO.setCantProductos(mayorVenta.getListaProductos().size());
            maxVentaDTO.setNomhre(mayorVenta.getCliente().getNombre());
            maxVentaDTO.setApellido(mayorVenta.getCliente().getApellido());

            return maxVentaDTO;
        }
    }
      
}
