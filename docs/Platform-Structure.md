# VimaxOS Platform Structure

VimaxOS is the shared platform. Product domains are organs connected to the same identity, trust, context, events, synchronization and capability model.

```text
VimaxOS-Genesis
├── core
│   ├── events
│   ├── identity
│   ├── intent
│   ├── modules
│   └── sync
├── security
├── modules
│   ├── system
│   └── nail
└── docs
```

## Product rule

A Vimax product may have its own domain data and interface, but it must not create an independent identity, trust, notification or synchronization universe.

## First acceptance test

A client creates an appointment on one device. A master receives it on another device, confirms it, and the client sees the confirmed state without recreating the record.
