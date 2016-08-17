package com.ethercamp.harmony.api.data;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

/**
 * Created by Stan Reshetnyk on 17.08.16.
 *
 * Test how API could look.
 */
@Value
@AllArgsConstructor(staticName = "valueOf")
public class ParsedBlock {

    public final long number;

    public final List<ParsedTransaction> transactionsList;

}
