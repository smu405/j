// TestHospitalAppointment.java
import java.time.LocalDateTime;
import com.oop2020.*;

class TestHospitalAppointment {
    public static void main(String[] args) {
        // 닥터 id는 10, 이름은 Dr. Lim
        Doctor d = new Doctor(10, "Dr. Lim");
        Patient p = new Patient("cho");
        LocalDateTime d1 = LocalDateTime.of(2020, 5, 20, 13, 30, 0);
        LocalDateTime d2 = LocalDateTime.of(2020, 6, 20, 13, 30, 0);
        LocalDateTime d3 = LocalDateTime.of(2020, 7, 20, 13, 30, 0);
        // HospitalAppointment형 배열 생성
        HospitalAppointment[] has = new HospitalAppointment[3];
        // 병원 약속 생성 후 저장(같은 의사, 환자,
        // 날짜와 시간만 다름)
        has[0] = new HospitalAppointment(d, p, d1);
        has[1] = new HospitalAppointment(d, p, d2);
        has[2] = new HospitalAppointment(d, p, d3);
        // 화면에 출력
        for (HospitalAppointment apnt : has) {
            System.out.println(apnt);
        }
    }
}
