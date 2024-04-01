package org.example.entity.invoice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
public class Invoice {
	private String contractor;
	@Builder.Default
	private List<Position> positions = new ArrayList<Position>();
}
