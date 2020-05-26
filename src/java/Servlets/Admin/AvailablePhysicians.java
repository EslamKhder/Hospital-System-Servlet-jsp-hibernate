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
        DoctorController dc = new DoctorController();
        if (!spec1.isEmpty()) {
            doctor.setSpecialty(spec1);
            doctor = dc.getDoctorSpec(session, doctor);
            doctor.setAvailable(1);
            dc.editDoctor(session, doctor);
        } else {
            doctor.setSpecialty("Eyes Doctor");
            doctor = dc.getDoctorSpec(session, doctor);
            doctor.setAvailable(0);
            dc.editDoctor(session, doctor);
        }

        if (!spec2.isEmpty()) {
            doctor.setSpecialty(spec2);
            doctor = dc.getDoctorSpec(session, doctor);
            doctor.setAvailable(1);
            dc.editDoctor(session, doctor);
        } else {
            doctor.setSpecialty("Analysis Doctor");
            doctor = dc.getDoctorSpec(session, doctor);
            doctor.setAvailable(0);
            dc.editDoctor(session, doctor);
        }
        if (!spec3.isEmpty()) {
            doctor.setSpecialty(spec3);
            doctor = dc.getDoctorSpec(session, doctor);
            doctor.setAvailable(1);
            dc.editDoctor(session, doctor);
        } else {
            doctor.setSpecialty("Rumor Doctor");
            doctor = dc.getDoctorSpec(session, doctor);
            doctor.setAvailable(0);
            dc.editDoctor(session, doctor);
        }
        if (!spec4.isEmpty()) {

            doctor.setSpecialty(spec4);
            doctor = dc.getDoctorSpec(session, doctor);
            doctor.setAvailable(1);
            dc.editDoctor(session, doctor);
        } else {
            doctor.setSpecialty("Pharmacist");
            doctor = dc.getDoctorSpec(session, doctor);
            doctor.setAvailable(0);
            dc.editDoctor(session, doctor);
        }
        response.getWriter().print("success");
    }
}
