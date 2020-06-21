package Servlets.Admin;

import Controller.DoctorController;
import Model.Doctor;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

public class AvailablePhysicians extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String spec1 = request.getParameter("spec1");
        String spec2 = request.getParameter("spec2");
        String spec3 = request.getParameter("spec3");
        String spec4 = request.getParameter("spec4");

        SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
        Doctor doctor = new Doctor();
        DoctorController dc1 = new DoctorController(session);
        DoctorController dc2 = new DoctorController(session);
        DoctorController dc3 = new DoctorController(session);
        DoctorController dc4 = new DoctorController(session);
        DoctorController dc5 = new DoctorController(session);
        DoctorController dc6 = new DoctorController(session);
        DoctorController dc7 = new DoctorController(session);
        DoctorController dc8 = new DoctorController(session);
        DoctorController dc9 = new DoctorController(session);
        DoctorController dc10 = new DoctorController(session);
        DoctorController dc11 = new DoctorController(session);
        DoctorController dc12 = new DoctorController(session);
        DoctorController dc13 = new DoctorController(session);
        DoctorController dc14 = new DoctorController(session);
        DoctorController dc15 = new DoctorController(session);
        DoctorController dc16 = new DoctorController(session);
        if (!spec1.isEmpty()) {
            doctor.setSpecialty(spec1);
            doctor = dc1.getDoctorSpec(doctor);
            doctor.setAvailable(1);
            dc2.editDoctor(doctor);
        } else {
            doctor.setSpecialty("Eyes Doctor");
            doctor = dc3.getDoctorSpec(doctor);
            doctor.setAvailable(0);
            dc4.editDoctor(doctor);
        }

        if (!spec2.isEmpty()) {
            doctor.setSpecialty(spec2);
            doctor = dc5.getDoctorSpec( doctor);
            doctor.setAvailable(1);
            dc6.editDoctor(doctor);
        } else {
            doctor.setSpecialty("Analysis Doctor");
            doctor = dc7.getDoctorSpec(doctor);
            doctor.setAvailable(0);
            dc8.editDoctor(doctor);
        }
        if (!spec3.isEmpty()) {
            doctor.setSpecialty(spec3);
            doctor = dc9.getDoctorSpec(doctor);
            doctor.setAvailable(1);
            dc10.editDoctor(doctor);
        } else {
            doctor.setSpecialty("Rumor Doctor");
            doctor = dc11.getDoctorSpec( doctor);
            doctor.setAvailable(0);
            dc12.editDoctor(doctor);
        }
        if (!spec4.isEmpty()) {

            doctor.setSpecialty(spec4);
            doctor = dc13.getDoctorSpec(doctor);
            doctor.setAvailable(1);
            dc14.editDoctor(doctor);
        } else {
            doctor.setSpecialty("Pharmacist");
            doctor = dc15.getDoctorSpec(doctor);
            doctor.setAvailable(0);
            dc16.editDoctor(doctor);
        }
        response.getWriter().print("success");
    }
}
