package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name ="member_id")
    private Long id;

    private String name;

    @Embedded //내장된것사용
    private Address address;

    @OneToMany(mappedBy = "member") //일대다 Order.member 에 의해서 매핑
    private List<Order> orders = new ArrayList<>();
}
