package com.digitalwarranty.digital_warranty_locker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/warranties")
@CrossOrigin
public class WarrantyController {

    private final WarrantyRepository warrantyRepository;

    public WarrantyController(WarrantyRepository warrantyRepository) {
        this.warrantyRepository = warrantyRepository;
    }

    @PostMapping
    public Warranty addWarranty(@RequestBody Warranty warranty) {
        return warrantyRepository.save(warranty);
    }

    @GetMapping
    public Iterable<Warranty> getAllWarranties() {
        return warrantyRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteWarranty(@PathVariable Long id) {
        warrantyRepository.deleteById(id);
    }
}