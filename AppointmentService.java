package Hospital.Services;

import Hospital.Models.Appointment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AppointmentService {

    private static final AppointmentService INSTANCE = new AppointmentService();
    private final List<Appointment> appointments = new ArrayList<>();

    public static AppointmentService getInstance() { return INSTANCE; }
    private AppointmentService() {}

    public void createAppointment(Appointment appointment) {
        if (appointment != null) appointments.add(appointment);
    }

    public void rescheduleAppointment(String appointmentId, LocalDate newDate, String newTime) {
        Appointment app = getAppointmentById(appointmentId);
        if (app != null) app.reschedule(newDate, newTime);
    }

    public void cancelAppointment(String appointmentId) {
        Appointment app = getAppointmentById(appointmentId);
        if (app != null) app.cancel();
    }

    public void completeAppointment(String appointmentId) {
        Appointment app = getAppointmentById(appointmentId);
        if (app != null) app.complete();
    }

    public Appointment getAppointmentById(String appointmentId) {
        if (appointmentId == null) return null;
        return appointments.stream()
                .filter(a -> appointmentId.equals(a.getAppointmentId()))
                .findFirst()
                .orElse(null);
    }

    public List<Appointment> getAppointmentsByPatient(String patientId) {
        if (patientId == null) return new ArrayList<>();
        return appointments.stream()
                .filter(a -> patientId.equals(a.getPatientId()))
                .collect(Collectors.toList());
    }

    public List<Appointment> getAppointmentsByDoctor(String doctorId) {
        if (doctorId == null) return new ArrayList<>();
        return appointments.stream()
                .filter(a -> doctorId.equals(a.getDoctorId()))
                .collect(Collectors.toList());
    }

    public List<Appointment> getAppointmentsByDate(LocalDate date) {
        if (date == null) return new ArrayList<>();
        return appointments.stream()
                .filter(a -> date.equals(a.getAppointmentDate()))
                .collect(Collectors.toList());
    }

    public List<Appointment> getUpcomingAppointments() {
        LocalDate today = LocalDate.now();
        return appointments.stream()
                .filter(a -> "Scheduled".equalsIgnoreCase(a.getStatus()))
                .filter(a -> !a.getAppointmentDate().isBefore(today))
                .collect(Collectors.toList());
    }

    public void displayAllAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }
        appointments.forEach(Appointment::displayInfo);
    }
}