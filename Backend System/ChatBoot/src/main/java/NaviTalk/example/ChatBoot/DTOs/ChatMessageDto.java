package NaviTalk.example.ChatBoot.DTOs;

import java.time.LocalDateTime;

public record ChatMessageDto(String question,String session_id,String user_id,String title) {}

