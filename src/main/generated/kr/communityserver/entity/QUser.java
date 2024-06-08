package kr.communityserver.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1998062451L;

    public static final QUser user = new QUser("user");

    public final StringPath addr1 = createString("addr1");

    public final StringPath addr2 = createString("addr2");

    public final StringPath email = createString("email");

    public final StringPath grade = createString("grade");

    public final StringPath hp = createString("hp");

    public final StringPath image = createString("image");

    public final DateTimePath<java.time.LocalDateTime> leaveDate = createDateTime("leaveDate", java.time.LocalDateTime.class);

    public final StringPath name = createString("name");

    public final StringPath nick = createString("nick");

    public final StringPath pass = createString("pass");

    public final StringPath provider = createString("provider");

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final StringPath regip = createString("regip");

    public final NumberPath<Integer> report = createNumber("report", Integer.class);

    public final StringPath reportEnd = createString("reportEnd");

    public final StringPath reportStart = createString("reportStart");

    public final StringPath role = createString("role");

    public final StringPath sms = createString("sms");

    public final StringPath uid = createString("uid");

    public final StringPath zip = createString("zip");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

