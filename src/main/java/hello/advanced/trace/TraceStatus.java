package hello.advanced.trace;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TraceStatus {
    private TraceId traceId; // 내부에 트랜잭션ID와 Level을 가지고 있다.
    private Long startTimeMs; // 로그 시작 시간, 이 시작시간을 기준으로 시작~종료까지 전체 수행시간을 계산
    private String message; // 시작시 사용한 메시지, 이후 로그 종료시에도 이 메시지를 사용해 출력
}
