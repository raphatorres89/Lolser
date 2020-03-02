package com.raphaowl.lolser.client.riotgames.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@ToString
public class StaticContentData {
        private Map<String, Object> content;

        public StaticContentData() {
                this.content = new LinkedHashMap<>();
        }
}
