package com.lambda.web.soccer;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="player")
public class Player {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerNo;

    @Column(length = 10) private String playerId;
    @Column(length = 10) private String playerName;
    @Column(length = 10) private String ePlayerName;
    @Column(length = 10) private String nickname;
    @Column(length = 10) private String joinYyyy;
    @Column(length = 10) private String position;
    @Column(length = 10) private String backNo;
    @Column(length = 10) private String nation;
    @Column(length = 10) private String birthDate;
    @Column(length = 10) private String solar;
    @Column(length = 10) private String height;
    @Column(length = 10) private String weight;
    @Column(length = 10) private String teamId;

    @Builder
    public Player(String playerId, String playerName, String ePlayerName, String nickname, String joinYyyy,
                  String position, String backNo, String nation, String birthDate, String solar, String height,
                  String weight, String teamId) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.ePlayerName = ePlayerName;
        this.nickname = nickname;
        this.joinYyyy = joinYyyy;
        this.position = position;
        this.backNo = backNo;
        this.nation = nation;
        this.birthDate = birthDate;
        this.solar = solar;
        this.height = height;
        this.weight = weight;
        this.teamId = teamId;
    }
}
