package kr.communityserver.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Setter
@Table(name = "user")
public class User {

    @Id
    private String uid;
    private String pass;
    private String name;
    private String nick;
    private String email;
    private String hp;
    private String role;
    private String grade;
    private String zip;
    private String addr1;
    private String addr2;
    private String image;
    private String regip;
    private String sms;
    private String provider;

    private int report;
    private String reportStart;
    private String reportEnd;

    @CreationTimestamp
    private LocalDateTime regDate;
    private LocalDateTime leaveDate;


    // 사용자 권한 및 인가 설정을 hasRole() 메서드로 처리하기 위해 접두어 "ROLE_" 추가
    public String getRole() {
        return "ROLE_"+role;
    }

}
