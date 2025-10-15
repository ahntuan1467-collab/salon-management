# 💇‍♀️ Salon Management System

> **Hệ thống Quản lý Salon Thẩm mỹ viện**  
> Xây dựng bằng **Spring Boot + Spring Web + Spring Data JPA + Thymeleaf + MySQL**  
> Dành cho việc quản lý **dịch vụ, khách hàng, nhân viên, lịch hẹn, thanh toán và khuyến mãi** trong salon.

---

## 🚀 Công nghệ sử dụng

| Thành phần | Công nghệ |
|-------------|------------|
| Backend | Java 17, Spring Boot 3.x |
| Framework | Spring Web MVC, Spring Data JPA |
| View | Thymeleaf, HTML5, CSS, Bootstrap |
| Database | MySQL |
| ORM | Hibernate |
| Build Tool | Maven |
| IDE gợi ý | IntelliJ IDEA / Eclipse |

---

## 🧩 Cấu trúc thư mục chính

salon-management/
├── src/
│ ├── main/
│ │ ├── java/com/example/salonmanagement/
│ │ │ ├── controller/ # Controller xử lý request (Home, Service, Customer, Booking,...)
│ │ │ ├── model/ # Các Entity ánh xạ CSDL
│ │ │ ├── repository/ # Interface làm việc với DB (JPA)
│ │ │ ├── service/ # Xử lý nghiệp vụ trung gian
│ │ │ └── util/ # Các class tiện ích (helper, format date, validation, v.v.)
│ │ ├── resources/
│ │ │ ├── templates/ # Giao diện Thymeleaf
│ │ │ ├── static/ # CSS, JS, hình ảnh
│ │ │ └── application.properties
│ └── test/ # Unit test
├── pom.xml # Cấu hình Maven
└── README.md

---

## 🧠 Các module chức năng

| # | Tên module | Mô tả |
|---|-------------|-------|
| 1 | 💇 **Dịch vụ (Service)** | Quản lý thông tin dịch vụ: tên, giá, loại, thời gian, trạng thái |
| 2 | 👥 **Khách hàng (Customer)** | Lưu thông tin khách hàng, điểm tích lũy, loại thành viên |
| 3 | 📝 **Đặt lịch (Booking)** | Lịch hẹn khách – dịch vụ – nhân viên |
| 4 | 👨‍💼 **Nhân viên (Staff)** | Quản lý nhân viên, chức vụ, chuyên môn, ca làm, lương |
| 5 | 💳 **Thanh toán (Payment)** | Ghi nhận thanh toán, phương thức, số tiền, ngày TT |
| 6 | 🏷 **Khuyến mãi (Promotion)** | Quản lý tên chương trình, loại, phần trăm giảm, thời hạn |
| 7 | 🧴 **Sản phẩm sử dụng (ProductUsage)** | Theo dõi sản phẩm dùng trong dịch vụ |

---

## ⚙️ Cấu hình kết nối MySQL

File: `src/main/resources/application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/salon_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.thymeleaf.cache=false
server.port=8080
