package Clase11.integradorUbert;

import Clase11.integradorUbert.conductores.Conductor;
import Clase11.integradorUbert.conductores.ConductorAuto;
import Clase11.integradorUbert.conductores.ConductorFluvial;
import Clase11.integradorUbert.estrategia.AprobarViajesLargosEstrategia;
import Clase11.integradorUbert.pasajeros.Pasajero;
import Clase11.integradorUbert.pasajeros.PasajeroImpl;
import Clase11.integradorUbert.plataforma.PlataformaBase;
import Clase11.integradorUbert.plataforma.PlataformaViajesException;
import Clase11.integradorUbert.plataforma.UbertAuto;
import Clase11.integradorUbert.plataforma.UbertWater;
import Clase11.integradorUbert.viaje.EstadoDeViaje; // <-- IMPORT CLAVE
import Clase11.integradorUbert.viaje.Viaje; // <-- IMPORT CLAVE

public class Main {

    public static void main(String[] args) {

        System.out.println("--- INICIANDO SIMULACIÓN UBERT ---");

        // 1. Crear las plataformas (Parte II)
        PlataformaBase plataformaAuto = new UbertAuto();
        PlataformaBase plataformaWater = new UbertWater();

        // 2. Crear Conductores
        Conductor conductorAuto1 = new ConductorAuto("c-auto-1", "Carlos (Auto)");
        Conductor conductorAuto2 = new ConductorAuto("c-auto-2", "Maria (Auto)");
        Conductor conductorFluvial1 = new ConductorFluvial("c-flu-1", "Neptuno (Fluvial)");

        // 3. (Opcional) Configurar Estrategias
        conductorAuto2.setEstrategia(new AprobarViajesLargosEstrategia(10));

        // 4. Agregar Conductores a las plataformas
        System.out.println("\n--- Conectando Conductores ---");
        plataformaAuto.agregarObservador(conductorAuto1);
        plataformaAuto.agregarObservador(conductorAuto2);

        plataformaAuto.agregarObservador(conductorFluvial1);
        plataformaWater.agregarObservador(conductorFluvial1);

        // 5. Crear Pasajeros
        Pasajero pasajeroAna = new PasajeroImpl("Ana");
        Pasajero pasajeroLuis = new PasajeroImpl("Luis");

        // 6. Simulación de Viajes
        try {
            // --- PRUEBA 1: Viaje corto (Rechazado por Maria, Aceptado por Carlos) ---
            System.out.println("\n--- PRUEBA 1: Pasajero Ana pide viaje AUTO corto (5km) ---");
            plataformaAuto.pedirViajePara(pasajeroAna, 5);

            // --- PRUEBA 2: Viaje largo (Aceptado por Maria) ---
            System.out.println("\n--- PRUEBA 2: Pasajero Luis pide viaje AUTO largo (15km) ---");
            plataformaAuto.pedirViajePara(pasajeroLuis, 15);

            // --- PRUEBA 3: Viaje Fluvial (Solo Neptuno es notificado) ---
            System.out.println("\n--- PRUEBA 3: Pasajero Ana pide viaje FLUVIAL (8km) ---");
            plataformaWater.pedirViajePara(pasajeroAna, 8);

            // --- PRUEBA 4: Finalizar viajes (Opcional 7) ---
            System.out.println("\n--- PRUEBA 4: Finalizando viajes ---");

            // --- ARREGLO CLAVE: Buscar en getTodosLosViajes() ---
            String idViajeMaria = plataformaAuto.getTodosLosViajes().stream()
                    .filter(v -> v.estadoDeViaje() == EstadoDeViaje.INICIADO && v.getConductor() == conductorAuto2)
                    .findFirst()
                    .map(Viaje::getId)
                    .orElse(null);

            if (idViajeMaria != null) {
                System.out.println("DEBUG: Finalizando el viaje de Maria: " + idViajeMaria);
                plataformaAuto.finalizarViaje(idViajeMaria);
            } else {
                System.out.println("DEBUG: No se encontró el viaje de Maria para finalizar.");
            }

            // --- PRUEBA 5: Reportes (Opcional 8) ---
            System.out.println("\n--- PRUEBA 5: Reporte Plataforma AUTO ---");
            System.out.println("Viajes Finalizados: " + plataformaAuto.getViajesRealizados().size());
            System.out.println("KM Totales Recorridos: " + plataformaAuto.getTotalKilometrosRecorridos());
            System.out.println("KM de Maria (c-auto-2): " + conductorAuto2.kmTotales());

        } catch (PlataformaViajesException e) {
            e.printStackTrace();
        }
    }
}