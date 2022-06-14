# study-spring-boot-jpashop

- 디비연결
```
cd ~/SpringStudy
cd h2
./h2.sh
```
- 외래 키가 있는 곳을 연관관계의 주인으로 정해라. 
- 모든 연관관계는 지연로딩(`LAZY`)로 설정하자
- @XToOne(OneToOne, ManyToOne) 관계는 기본이 즉시로딩이므로 직접 지연로딩으로 설정해야 한다.
- CascadeType.ALL order 저장시 item도 같이 저장