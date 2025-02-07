/*
 * (C) Copyright IBM Corp. 2021
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.ibm.whc.deid.providers.masking;

import com.ibm.whc.deid.shared.exception.Keyed;
import com.ibm.whc.deid.utils.log.LogCodes;
import com.ibm.whc.deid.utils.log.Messages;

public class PrivacyProviderInvalidInputException extends IllegalArgumentException
    implements Keyed {

  private static final long serialVersionUID = 3703087254325803213L;

  public static final String MESSAGE_ID = LogCodes.WPH1024E;

  public PrivacyProviderInvalidInputException(String input, String ruleName) {
    // do not use the actual input value - it could be sensitive data (PHI)
    // and the exception message could be logged in some environments
    super(Messages.getMessage(MESSAGE_ID, ruleName));
  }

  @Override
  public String getMessageKey() {
    return MESSAGE_ID;
  }
}
