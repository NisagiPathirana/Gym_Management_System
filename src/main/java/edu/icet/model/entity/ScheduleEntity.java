package edu.icet.model.entity;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ScheduleEntity {
    private String scheduleId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String timeDuration;
}
