package com.nk.wipro.exception;

@SuppressWarnings("serial")
public class DonorNotFoundException extends RuntimeException {
    public DonorNotFoundException(Long id) {
        super("Donor with ID " + id + " not found");
    }
}
