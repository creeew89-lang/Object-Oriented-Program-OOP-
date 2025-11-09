package Hospital.interfaces;

import java.time.LocalDate;

public interface Appointable<Appointment> {
    boolean scheduleAppointment(Appointment appointment);
    boolean cancelAppointment(String appointmentId);
    boolean rescheduleAppointment(String appointmentId, LocalDate newDate);
}