# HospitalManagement
HospitalManagement A Spring Boot application for managing hospital operations, including CRUD functionality for patients, doctors, and appointments. Uses JPA, MySQL, and RESTful APIs for backend management.

### Patient
- `POST /createPatient` - Add a new patient
- `GET /SearchPatientById?id={id}` - Get patient by ID
- `GET /SearchPatientByName?name={name}` - Get patients by name
- `GET /SearchPatientByEmail?email={email}` - Get patients by email
- `GET /SearchPatientByMobileNumber?mobileNumber={mobileNumber}` - Get patients by mobile number
- `GET /SearchPatientByDOB?birthdate={birthdate}` - Get patients by birthdate
- `PATCH /updatePatient/{id}` - Update patient details
- `DELETE /deletePatient?id={id}` - Delete patient

### Doctor
- `POST /createDoctor` - Add a new doctor
- `GET /SearchDoctorById?id={id}` - Get doctor by ID
- `GET /SearchDoctorByName?name={name}` - Get doctors by name
- `GET /SearchDoctorByEmail?email={email}` - Get doctors by email
- `GET /SearchDoctorByMobileNumber?mobileNumber={mobileNumber}` - Get doctors by mobile number
- `PATCH /updateDoctor/{id}` - Update doctor details
- `DELETE /deleteDoctor?id={id}` - Delete doctor

### Appointment
- `POST /createAppointment` - Add a new appointment
- `GET /readById?id={id}` - Get appointment by ID
- `GET /readByDoctorName?name={name}` - Get appointments by doctor name
- `GET /readByPatientName?name={name}` - Get appointments by patient name
- `GET /readByDate?date={date}` - Get appointments by date
- `PATCH /UpdateAppointment?id={id}` - Update appointment details
- `DELETE /deleteAppointment?id={id}` - Delete appointment

## Contributing
Contributions are welcome! Please open issues or submit pull requests for improvements.
   - Set your MySQL URL, username, and password.
3. **Build and run the project:**
   ```
   ./mvnw spring-boot:run
   ```
4. **Access the API endpoints** at `http://localhost:8080/`

## API Endpoints (Examples)

### Patient
- `POST /createPatient` - Add a new patient
- `GET /SearchPatientById?id={id}` - Get patient by ID
- `GET /SearchPatientByName?name={name}` - Get patients by name
- `PATCH /updatePatient/{id}` - Update patient details

### Doctor
- `POST /createDoctor` - Add a new doctor
- `GET /SearchDoctorById?id={id}` - Get doctor by ID
- `GET /SearchDoctorByName?name={name}` - Get doctors by name
- `PATCH /updateDoctor/{id}` - Update doctor details

### Appointment
- `POST /createAppointment` - Add a new appointment
- `GET /readById?id={id}` - Get appointment by ID
- `GET /readByDoctorName?name={name}` - Get appointments by doctor name
- `GET /readByPatientName?name={name}` - Get appointments by patient name
- `GET /readByDate?date={date}` - Get appointments by date
- `PATCH /UpdateAppointment?id={id}` - Update appointment details
- `DELETE /deleteAppointment?id={id}` - Delete appointment

## Contributing
Contributions are welcome! Please open issues or submit pull requests for improvements.



