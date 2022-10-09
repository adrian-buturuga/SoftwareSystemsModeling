# Glovo app:

Order Management System for Glovo:

- close orders
- repair orders
- finalize orders

Notes:

- validation of request is immediate
- processing of request is async

Finalizing requires approval.


![outbound.png](outbound.png)

![inbound.png](inbound.Png)

![transitions.png](transitions.png)

# Instruction data and acknowledgement / specifications

## Considerations

The Rest API is supposed to wait for an acknowledgement just having received the instruction. It does not actually execute the instruction.
There must be a mechanism implemented to handle time-outs and other (delaying) issues when the Rest API is trying to send an instruction and is waiting for acknowledgement.

## Close command

The command will only change the status within `Processor` to "closed" without any further action

### Instruction data includes:

- OrderId
- type (open / incorrect)
- "Action" = close

### Acknowledgement includes

- OrderId
- "Acknowledgement"= "ACK" / "NACK"

## Finalize command

### This command sends:

- commands to update order (where applicable);
- it then instructs `Processor` to finalize the order. It does not actually executes the attempt itself (executed by another process within `Processor`) ?.

### Instruction data:

- OrderId
- Type (open or incorrect)
- "Action" = finalize

### Acknowledgement includes:

- OrderId
- "Acknowledgement"= "ACK" / "NACK"

## Re-Open command

The command will only change the status within `Processor` to "open" without any further action

### Instruction data includes:

- OrderId
- Type (open or incorrect)
- "Action" = re-open

### Acknowledgement data:

- OrderId
- "Acknowledgement"= "ACK" / "NACK"

## Processing results

Typically the following data is received via the `message broker`:

- OrderId
- type (open / incorrect)
- "Result" = "NOT FOUND" / "OK" / "NOK" (applicable for finalize command)
- "Result" = "NOT FOUND" / "CLOSED" (applicable for close command)
- "Result" = "RE-OPENED" (applicable for Re-Open command)