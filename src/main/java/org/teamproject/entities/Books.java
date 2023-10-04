package org.teamproject.entities;

import jakarta.persistence.*;
import lombok.*;
import org.teamproject.commons.constants.BookStatus;
import org.teamproject.commons.constants.Role;

import java.util.List;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Books extends BaseEntity{

    @Id @GeneratedValue
    private Long bookNo;

    @Column(nullable = false, updatable = false)
    private String bookId;

    @Column(length = 100, nullable = false)
    private String bookNm;

    @Column(length = 50)
    private String category;

    @Column(length = 50, nullable = false)
    private String gid;

    private String bookDesc; // 상품에 대한 설명
    private int price;
    private int stock; // 재고

    @Enumerated(EnumType.STRING)
    @Column(length = 25, nullable = false)
    private BookStatus status = BookStatus.READY;   // 판매중 기본값

    @Lob
    private String description;

    private long listOrder;

    @Transient
    private List<FileInfo> mainImages; // 상품 메인 이미지

    @Transient
    private List<FileInfo> listImages; // 목록 이미지

    @Transient
    private List<FileInfo> editorImages; // 에디터 이미지

    @Enumerated(EnumType.STRING)
    private Role role;
}